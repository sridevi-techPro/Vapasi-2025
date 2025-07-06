package com.tw.splitwise.service.impl;

import com.tw.splitwise.model.Expense;
import com.tw.splitwise.service.contract.IExpenseReader;
import com.tw.splitwise.util.LoggerUtil;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class FileExpenseReader implements IExpenseReader {
    private static final Logger logger = LoggerUtil.getLogger(FileExpenseReader.class);

    @Override
    public List<Expense> read(String filename) {
        List<Expense> expenses = new ArrayList<>();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(filename)) {
            if (is == null) throw new IllegalArgumentException("File not found: " + filename);

            Scanner scanner = new Scanner(is);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(" spent ");
                if (parts.length < 2) continue;

                String payer = parts[0].trim();
                String[] rest = parts[1].split(" for ", 2);
                double amount = Double.parseDouble(rest[0].trim());

                String[] descAndPeople = rest[1].split(" for ", 2);
                String description = descAndPeople[0].trim();
                List<String> participants = Arrays.stream(descAndPeople[1].split(","))
                        .map(String::trim).collect(Collectors.toList());

                expenses.add(new Expense(payer, amount, description, participants));
            }
        } catch (Exception e) {
            LoggerUtil.error(logger,"Error reading file: " + e.getMessage());
        }
        return expenses;
    }
}
