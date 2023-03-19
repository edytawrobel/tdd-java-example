package org.example.test;

import org.example.src.Rose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RoseTest {
        @Test
        public void shouldPrintHelloRose() {
            String prompt = "Hello Rose!";
            Rose app = new Rose();
            assertEquals(prompt, app.hello());
        }
}