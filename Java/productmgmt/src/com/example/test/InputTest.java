package com.example.test;

import com.example.Input;
import com.example.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    @Test
    void testfileInput() {
        List<Product> list = new ArrayList<Product>();
        Input input = new Input(list);
        input.fileInput();
        // assertNotNull(list);
        assertEquals("DISKETTE", list.get(5).getName());
    }
}