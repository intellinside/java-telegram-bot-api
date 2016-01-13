package com.pengrad.telegrambot;

import com.pengrad.telegrambot.model.Update;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * stas
 * 10/21/15.
 */
public class UpdateTest {

    public static void check(List<Update> updates) {
        for (Update update : updates) {
            assertNotNull(update.updateId());
            if (update.message() != null) MessageTest.checkMessage(update.message());
            else if (update.inlineQuery() != null) InlineQueryTest.checkQuery(update.inlineQuery());
            else throw new RuntimeException("Both message and inlineQuery are null");
        }
    }

}
