package uk.co.real_logic.artio.builder;

import uk.co.real_logic.artio.util.MutableAsciiBuffer;

// Partial FIX header - only fields used by session layer (see session_dictionary.xml).
// The expectation is that every realistic dictionary will have those defined with the right names.
public interface SessionHeaderEncoder
{
    SessionHeaderEncoder beginString(byte[] value, int length);

    SessionHeaderEncoder beginString(byte[] value, int offset, int length);

    SessionHeaderEncoder beginString(byte[] value);

    SessionHeaderEncoder beginString(CharSequence value);

    SessionHeaderEncoder beginString(char[] value);

    SessionHeaderEncoder beginString(char[] value, int length);

    SessionHeaderEncoder beginString(char[] value, int offset, int length);

    boolean hasBeginString();

    SessionHeaderEncoder senderCompID(byte[] value, int length);

    SessionHeaderEncoder senderCompID(byte[] value, int offset, int length);

    SessionHeaderEncoder senderCompID(byte[] value);

    SessionHeaderEncoder senderCompID(CharSequence value);

    SessionHeaderEncoder senderCompID(char[] value);

    SessionHeaderEncoder senderCompID(char[] value, int length);

    SessionHeaderEncoder senderCompID(char[] value, int offset, int length);

    boolean hasSenderCompID();

    SessionHeaderEncoder targetCompID(byte[] value, int length);

    SessionHeaderEncoder targetCompID(byte[] value, int offset, int length);

    SessionHeaderEncoder targetCompID(byte[] value);

    SessionHeaderEncoder targetCompID(CharSequence value);

    SessionHeaderEncoder targetCompID(char[] value);

    SessionHeaderEncoder targetCompID(char[] value, int length);

    SessionHeaderEncoder targetCompID(char[] value, int offset, int length);

    boolean hasTargetCompID();

    SessionHeaderEncoder msgSeqNum(int value);

    boolean hasMsgSeqNum();

    SessionHeaderEncoder senderSubID(byte[] value, int length);

    SessionHeaderEncoder senderSubID(byte[] value, int offset, int length);

    SessionHeaderEncoder senderSubID(byte[] value);

    SessionHeaderEncoder senderSubID(CharSequence value);

    SessionHeaderEncoder senderSubID(char[] value);

    SessionHeaderEncoder senderSubID(char[] value, int length);

    SessionHeaderEncoder senderSubID(char[] value, int offset, int length);

    boolean hasSenderSubID();

    SessionHeaderEncoder senderLocationID(byte[] value, int length);

    SessionHeaderEncoder senderLocationID(byte[] value, int offset, int length);

    SessionHeaderEncoder senderLocationID(byte[] value);

    SessionHeaderEncoder senderLocationID(CharSequence value);

    SessionHeaderEncoder senderLocationID(char[] value);

    SessionHeaderEncoder senderLocationID(char[] value, int length);

    SessionHeaderEncoder senderLocationID(char[] value, int offset, int length);

    boolean hasSenderLocationID();

    SessionHeaderEncoder targetSubID(byte[] value, int length);

    SessionHeaderEncoder targetSubID(byte[] value, int offset, int length);

    SessionHeaderEncoder targetSubID(byte[] value);

    SessionHeaderEncoder targetSubID(CharSequence value);

    SessionHeaderEncoder targetSubID(char[] value);

    SessionHeaderEncoder targetSubID(char[] value, int length);

    SessionHeaderEncoder targetSubID(char[] value, int offset, int length);

    boolean hasTargetSubID();

    SessionHeaderEncoder targetLocationID(byte[] value, int length);

    SessionHeaderEncoder targetLocationID(byte[] value, int offset, int length);

    SessionHeaderEncoder targetLocationID(byte[] value);

    SessionHeaderEncoder targetLocationID(CharSequence value);

    SessionHeaderEncoder targetLocationID(char[] value);

    SessionHeaderEncoder targetLocationID(char[] value, int length);

    SessionHeaderEncoder targetLocationID(char[] value, int offset, int length);

    boolean hasTargetLocationID();

    SessionHeaderEncoder possDupFlag(boolean value);

    boolean hasPossDupFlag();

    SessionHeaderEncoder possResend(boolean value);

    boolean hasPossResend();

    SessionHeaderEncoder sendingTime(byte[] value, int length);

    SessionHeaderEncoder sendingTime(byte[] value, int offset, int length);

    SessionHeaderEncoder sendingTime(byte[] value);

    boolean hasSendingTime();

    SessionHeaderEncoder origSendingTime(byte[] value, int length);

    SessionHeaderEncoder origSendingTime(byte[] value, int offset, int length);

    SessionHeaderEncoder origSendingTime(byte[] value);

    boolean hasOrigSendingTime();

    SessionHeaderEncoder lastMsgSeqNumProcessed(int value);

    boolean hasLastMsgSeqNumProcessed();

    long startMessage(MutableAsciiBuffer buffer, int offset);

}
