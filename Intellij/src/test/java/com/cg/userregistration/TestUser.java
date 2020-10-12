package com.cg.userregistration;
import com.cg.userregistration.userregistration.User;
import org.junit.*;
public class TestUser {
    User user = new User();
    @Test
    public void test1FirstName_CapitalLetterFirst()
    {
        Assert.assertTrue(user.Operation("Prajwal",user.firstNameCheck));
    }
    @Test
    public void test2FirstName_SmallLetterFirst()
    {
        Assert.assertFalse(user.Operation("prajwal",user.firstNameCheck));
    }
    @Test
    public void test3LastName_CapitalLetterFirst()
    {
        Assert.assertTrue(user.Operation("Prajwal",user.lastNameCheck));
    }
    @Test
    public void test4LastName_SmallLetterFirst()
    {
        Assert.assertFalse(user.Operation("prajwal",user.lastNameCheck));
    }
    @Test
    public void test5Email_CheckifNonMandatoryEmailPartNotFound()
    {
        Assert.assertTrue(user.Operation("abc.xyz@bl.co.in",user.emailCheck));
    }
    @Test
    public void test6Email_CheckMandatoryEmailPartNotFound()
    {
        Assert.assertFalse(user.Operation(".xyz@bl",user.emailCheck));
    }
    @Test
    public void test7mobile_WithSpace()
    {
        Assert.assertTrue(user.Operation("91 8861356135",user.mobileCheck));
    }
    @Test
    public void test8mobile_WithoutSpace()
    {
        Assert.assertFalse(user.Operation("918861356135",user.mobileCheck));
    }
    @Test
    public void test9mobile_WithoutFormat()
    {
        Assert.assertFalse(user.Operation("917 886135613",user.mobileCheck));
    }
    @Test
    public void test10password_AllCaseMatch()
    {
        Assert.assertTrue(user.Operation("Pr@jwalr1",user.passwordCheck));
    }
    @Test
    public void test11password_NoCapitalCase()
    {
        Assert.assertFalse(user.Operation("pr@jwalr1",user.passwordCheck));

    }
    @Test
    public void test12password_LessThan8Characters()
    {
        Assert.assertFalse(user.Operation("pr@jwa1",user.passwordCheck));
    }
    @Test
    public void test13password_NoNumeric()
    {
        Assert.assertFalse(user.Operation("pr@jwalr",user.passwordCheck));
    }
    @Test
    public void test14password_2SpecialCharacters()
    {
        Assert.assertFalse(user.Operation("pr@jw@lr1",user.passwordCheck));
    }
}
