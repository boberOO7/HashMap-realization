package com.liakhovskyi.hashmap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MyHashMapTest {

    private MyHashMap defaultHashMap = new MyHashMap();
    private MyHashMap sizedHashMap = new MyHashMap(6);

    @Before
    public void init() {
        defaultHashMap.put(1, 100L);
        defaultHashMap.put(2, 200L);
        defaultHashMap.put(3, 300L);
        defaultHashMap.put(4, 400L);

        sizedHashMap.put(5, 500L);
        sizedHashMap.put(6, 600L);
        sizedHashMap.put(7, 700L);
        sizedHashMap.put(8, 800L);
    }

    @Test
    public void testMapReturnProperValueForKey() {
        Long expectedResult = 200L;
        Long actualResult = defaultHashMap.get(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMapReturnProperSize() {
        int expectedResult = 4;
        int actualResult = defaultHashMap.size();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMapReturnProperSizeAfterAddingElementsWithNullKey() {
        int expectedResult = 5;
        defaultHashMap.put(null, 10L);
        defaultHashMap.put(null, 20L);
        defaultHashMap.put(null, 30L);
        int actualResult = defaultHashMap.size();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMapReturnProperValueAfterAddingElementsWithNullKey() {
        Long expectedResult = 30L;
        defaultHashMap.put(null, 10L);
        defaultHashMap.put(null, 20L);
        defaultHashMap.put(null, 30L);
        Long actualResult = defaultHashMap.get(null);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMapReturnProperSizeAfterIncreasingMapCapacity() {
        int expectedResult = 7;
        sizedHashMap.put(9, 900L);
        sizedHashMap.put(10, 1000L);
        sizedHashMap.put(11, 1100L);
        int actualResult = sizedHashMap.size();
        assertEquals(expectedResult, actualResult);
    }


}
