package com.thomsonreuters.upa.transport;

/**
 * UPA Write Flags passed into the
 * {@link Channel#write(TransportBuffer, WriteArgs, Error)} method call.
 * 
 * @see Channel
 */
public class WriteFlags
{
    // WriteFlags class cannot be instantiated
    private WriteFlags()
    {
        throw new AssertionError();
    }

    /**
     * No modification will be performed to this {@link Channel#write(TransportBuffer, WriteArgs, Error)} operation.
     */
    public static final int NO_FLAGS = 0x00;
   
    /**
     * Indicates that this message should not be compressed even if compression
     * is enabled for this connection.
     */
    public static final int DO_NOT_COMPRESS = 0x01;
    
    /**
     * Write will attempt to pass the data directly to the transport, avoiding
     * the queuing. If anything is currently queued, data will be queued. This
     * option will increase CPU use but may decrease latency.
     */
    public static final int DIRECT_SOCKET_WRITE = 0x02;
        
    /**
     * indicates that the writer wants to attach a sequence number to this message
     */

    public static final int WRITE_SEQNUM = 0x04;
    
    /**
     * indicates that this message is a retransmission of previous content. 
     * This requires a user supplied sequence number to indicate which packet is being retransmitted
     */

    public static final int WRITE_RETRANSMIT = 0x10;    
    
    /*
     * This is the max combined value of the bits mask that is allowed.
     */
    static final int MAX_VALUE = 0x10;
}
