package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    private List<String> headers;
    private List<List<String>> data;
    private int currentRowIndex;

    public CsvHandler() {
        headers = new ArrayList<>();
        data = new ArrayList<>();
        currentRowIndex = 0;
    }

    public void addHeader(String header) {
        headers.add(header);
    }

    public void addRow(List<String> row) {
        data.add(row);
    }

    public void writeToFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add(String.join(",", headers));

        for (List<String> row : data) {
            lines.add(String.join(",", row));
        }

        FileUtils.writeLines(new File(filePath), lines);
    }

    public void readFromFile(String filePath) throws IOException {
        List<String> lines = FileUtils.readLines(new File(filePath), "UTF-8");

        headers = parseLine(lines.get(0));

        data.clear();
        for (int i = 1; i < lines.size(); i++) {
            List<String> row = parseLine(lines.get(i));
            data.add(row);
        }

        currentRowIndex = 0;
    }

    public List<String> getNextRow() {
        if (currentRowIndex < data.size()) {
            return data.get(currentRowIndex++);
        }
        return null;
    }

    public boolean hasMoreRows() {
        return currentRowIndex < data.size();
    }

    private List<String> parseLine(String line) {
        String[] values = line.split(",");
        List<String> result = new ArrayList<>();
        for (String value : values) {
            result.add(value.trim());
        }
        return result;
    }
}
