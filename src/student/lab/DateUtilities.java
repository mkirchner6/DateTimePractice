/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author mattkirchner
 */
public class DateUtilities {
    //with default pattern
    public final String toStringDefaultFormat(LocalDateTime date) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
        return defaultFormat.format(date);
    }
    
    //with custom format
    public final String toStringCustomnFormat(LocalDateTime date, String custFormat) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern(custFormat);
        return defaultFormat.format(date);
    }
    
    //with default format
    public final LocalDateTime toLocalDateTimeDefaultFormat(String date) throws ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        return LocalDateTime.parse(date, formatter);
    }
    
    //with custom format
    public final LocalDateTime toLocalDateTimecustomFormat(String date, String custFormat) throws ParseException{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(custFormat);
        return LocalDateTime.parse(date, formatter);
    }
}
