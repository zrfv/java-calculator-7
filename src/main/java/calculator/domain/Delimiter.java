package calculator.domain;

import calculator.domain.constant.DefaultDelimiter;
import calculator.util.DelimiterValidator;
import java.util.ArrayList;
import java.util.List;

public class Delimiter {
    private String inputString;
    private List<String> delimiterList = new ArrayList<>();
    private String customDelimiter;

    public Delimiter(String inputString) {
        this.inputString = inputString;
        setDefaultDelimiter();
    }

    private void setDefaultDelimiter() {
        delimiterList.addAll(DefaultDelimiter.getDefaultDelimiters());
    }

    private void setCustomDelimiter() {
        DelimiterValidator.checkTypeOfCustomDelimiter(findDelimiterEndIndex());

        customDelimiter = inputString.substring(2, findDelimiterEndIndex());
        DelimiterValidator.afterFindCustomDelimiter(customDelimiter);

        delimiterList.add(escapeSpecialRegexChars(customDelimiter));
        inputString = inputString.substring(findDelimiterEndIndex() + 2);
    }

    private int findDelimiterEndIndex() {
        return inputString.indexOf("\\n");
    }

    private void checkCustomDelimiter() {
        if (inputString.startsWith("//")) {
            setCustomDelimiter();
        }
    }

    public String[] splitString() {
        checkCustomDelimiter();
        if (inputString == null || inputString.trim().isEmpty()) {
            return null;
        }
        String delimiterRegex = String.join("|", delimiterList); // ",|:|customDeli"
        return inputString.split(delimiterRegex);
    }

    private String escapeSpecialRegexChars(String delimiter) {
        return delimiter.replaceAll("([\\[\\]\\\\.^$|?*+(){}])", "\\\\$1");
    }

    public String getCustomDelimiter() {
        return customDelimiter;
    }
}
