package org.example.controller;

import lombok.Getter;
import lombok.Setter;
import org.example.domain.Status;
@Getter
@Setter
public class TaskInfo {

    private String description;

    private Status status;

}
