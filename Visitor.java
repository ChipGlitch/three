/**
 * CSC 402-02 Assignment #4
 * 
 * On my honor, Zachary Chiappini, this assignment is my own work.
 * I, Zachary Chiappini, will follow the instructor's rules and processes
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class Visitor {
	//---------------------------------------------------------------------
    private static Visitor instance = null;
    private Visitor()
    {}
    public static Visitor getInstance()
    {
        if (instance == null)
            instance = new Visitor();
        return instance;
    }
	//---------------------------------------------------------------------	
}
