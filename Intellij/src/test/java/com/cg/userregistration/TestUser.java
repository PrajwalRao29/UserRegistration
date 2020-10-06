package com.cg.userregistration;
import org.junit.*;
public class TestUser {
    User user = new User();
    @Test
    public void test1FirstName_CapitalLetterFirst()
    {
        Assert.assertTrue(user.FirstNameCheck("Prajwal"));
    }
    @Test
    public void test2FirstName_SmallLetterFirst()
    {
        Assert.assertFalse(user.FirstNameCheck("prajwal"));
    }
    @Test
    public void test3LastName_CapitalLetterFirst()
    {
        Assert.assertTrue(user.LastNameCheck("Prajwal"));
    }
    @Test
    public void test4LastName_SmallLetterFirst()
    {
        Assert.assertFalse(user.FirstNameCheck("prajwal"));
    }
    @Test
    public void test5Email_CheckifNonMandatoryEmailPartNotFound()
    {
        Assert.assertTrue(user.emailCheck("abc.xyz@bl.co.in"));
    }
    @Test
    public void test6Email_CheckMandatoryEmailPartNotFound()
    {
        Assert.assertFalse(user.emailCheck(".xyz@bl"));
    }
    @Test
    public void test7mobile_WithSpace()
    {
        Assert.assertTrue(user.mobileCheck("91 8861356135"));
    }
    @Test
    public void test8mobile_WithoutSpace()
    {
        Assert.assertFalse(user.mobileCheck("918861356135"));
    }
    @Test
    public void test9mobile_WithoutFormat()
    {
        Assert.assertFalse(user.mobileCheck("917 886135613"));
    }
    @Test
    public void test10password_AllCaseMatch()
    {
        Assert.assertTrue(user.passwordCheck("Pr@jwalr1"));
    }
    @Test
    public void test11password_NoCapitalCase()
    {
        Assert.assertFalse(user.passwordCheck("pr@jwalr1"));
    }
    @Test
    public void test12password_LessThan8Characters()
    {
        Assert.assertFalse(user.passwordCheck("pr@jwa1"));
    }
    @Test
    public void test13password_NoNumeric()
    {
        Assert.assertFalse(user.passwordCheck("pr@jwalr"));
    }
    @Test
    public void test14password_2SpecialCharacters()
    {
        Assert.assertFalse(user.passwordCheck("pr@jw@lr1"));
    }
}
