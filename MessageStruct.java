import java.io.Serializable;
class MessageStruct implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String reqID;
	int msgType; //0 - req 1-response 3-abort
    int nodeid ;
    int locktype; // 0 - read 1 - write
    String filename;
    int verNum;
    
    

    public  MessageStruct( String reqID, int msgType, int nodeid, int locktype, String filename, int verNum)
    {
       this.reqID=reqID;
       this.msgType=msgType;
       this.nodeid=nodeid;
       this.locktype=locktype;
       this.filename=filename;
       this.verNum=verNum;
    }

   
}
