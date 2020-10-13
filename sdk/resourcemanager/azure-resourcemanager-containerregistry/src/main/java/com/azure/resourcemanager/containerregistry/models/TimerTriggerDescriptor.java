// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TimerTriggerDescriptor model. */
@Fluent
public final class TimerTriggerDescriptor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimerTriggerDescriptor.class);

    /*
     * The timer trigger name that caused the run.
     */
    @JsonProperty(value = "timerTriggerName")
    private String timerTriggerName;

    /*
     * The occurrence that triggered the run.
     */
    @JsonProperty(value = "scheduleOccurrence")
    private String scheduleOccurrence;

    /**
     * Get the timerTriggerName property: The timer trigger name that caused the run.
     *
     * @return the timerTriggerName value.
     */
    public String timerTriggerName() {
        return this.timerTriggerName;
    }

    /**
     * Set the timerTriggerName property: The timer trigger name that caused the run.
     *
     * @param timerTriggerName the timerTriggerName value to set.
     * @return the TimerTriggerDescriptor object itself.
     */
    public TimerTriggerDescriptor withTimerTriggerName(String timerTriggerName) {
        this.timerTriggerName = timerTriggerName;
        return this;
    }

    /**
     * Get the scheduleOccurrence property: The occurrence that triggered the run.
     *
     * @return the scheduleOccurrence value.
     */
    public String scheduleOccurrence() {
        return this.scheduleOccurrence;
    }

    /**
     * Set the scheduleOccurrence property: The occurrence that triggered the run.
     *
     * @param scheduleOccurrence the scheduleOccurrence value to set.
     * @return the TimerTriggerDescriptor object itself.
     */
    public TimerTriggerDescriptor withScheduleOccurrence(String scheduleOccurrence) {
        this.scheduleOccurrence = scheduleOccurrence;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}