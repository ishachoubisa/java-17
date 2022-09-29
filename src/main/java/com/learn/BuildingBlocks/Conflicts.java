package com.learn.BuildingBlocks;

//import java.util.*;//This is first case where you will get compilation error java does not know which Date
                     // class to use.
//import java.sql.*;


import java.util.Date;//Second case if we want to use util.Date class we can write import statements like
                      // this,preference will always goes to util.Date class over sql.* wildcard
// import java.sql.*;


//import java.util.Date;//Third case if you want to use Date class of both packages util and sql then you should use
                        //Fully Qualified class name with one class or both the class as shown in program
//import java.sql.Date;

public class Conflicts {
    Date date;
    //java.util.Date date;//This is fully qualified class name
    //java.sql.Date sqldate;
}
