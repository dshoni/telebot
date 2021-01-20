package dev.bardin.telebot.app;

import dev.bardin.telebot.list.LinkedList;

import static dev.bardin.telebot.utilities.StringUtils.join;
import static dev.bardin.telebot.utilities.StringUtils.split;
import static dev.bardin.telebot.app.MessageUtils.getMessage;

public class CalendarHandler {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}
