package org.example;

import lombok.*;

import java.time.LocalDate;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GardenTask extends Task{
    private String title;
    private String description;
    private LocalDate dueDate;
    private String gardenLocation;

}
