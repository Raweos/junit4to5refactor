package com.example.usage;


import com.example.categories.Integration;
import com.example.categories.Slow;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TagsDemo {

    @Test
    @Category({Integration.class, Slow.class})
    public void integrationTest(){
        //some test
    }
}
