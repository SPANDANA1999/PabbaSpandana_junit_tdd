package com.epam.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;;


public class AppTest
{
public remove remove;
@BeforeEach
public void init()
{
remove=new remove();
}

@Test
public void Test0Char()
{
assertEquals("",remove.removing(""));
}

@Test
public void TestWithoutA()
{
assertEquals("BCD",remove.removing("BCD"));
}

@Test
public void TestAtIndex0()
{
assertEquals("BCD",remove.removing("ABCD"));
}
@Test
public void TestAtIndex1()
{
assertEquals("BCD",remove.removing("BACD"));
}

@Test
public void TestFirst2A()
{
assertEquals("BC",remove.removing("AABC"));
}

@Test
public void AafterIndex1()
{
assertEquals("BCDADA",remove.removing("BCDADA"));
}
@Test
public void TestWithABeforeAndAfter()
{
assertEquals("BAA",remove.removing("AABAA"));
}


    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}