package com.example.extensions;


import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DisabledOnMondayExtension implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        return LocalDate.now().getDayOfWeek() == DayOfWeek.MONDAY
                ? ConditionEvaluationResult.disabled("Not working in mondays")
                : ConditionEvaluationResult.enabled("Ok");
    }
}
