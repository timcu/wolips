/* ====================================================================
 * 
 * The ObjectStyle Group Software License, Version 1.0 
 *
 * Copyright (c) 2002 The ObjectStyle Group 
 * and individual authors of the software.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:  
 *       "This product includes software developed by the 
 *        ObjectStyle Group (http://objectstyle.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "ObjectStyle Group" and "Cayenne" 
 *    must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written 
 *    permission, please contact andrus@objectstyle.org.
 *
 * 5. Products derived from this software may not be called "ObjectStyle"
 *    nor may "ObjectStyle" appear in their names without prior written
 *    permission of the ObjectStyle Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE OBJECTSTYLE GROUP OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the ObjectStyle Group.  For more
 * information on the ObjectStyle Group, please see
 * <http://objectstyle.org/>.
 *
 */
/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package org.objectstyle.woenvironment.util;
public class ParserTokenManager implements ParserConstants {
	public java.io.PrintStream debugStream = System.out;
	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}
	private final int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
			default :
				return -1;
		}
	}
	private final int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}
	private final int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}
	private final int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}
	private final int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
			case 12 :
				return jjStartNfaWithStates_0(0, 5, 11);
			case 34 :
				return jjStopAtPos(0, 17);
			case 40 :
				return jjStopAtPos(0, 10);
			case 41 :
				return jjStopAtPos(0, 11);
			case 44 :
				return jjStopAtPos(0, 14);
			case 59 :
				return jjStopAtPos(0, 15);
			case 61 :
				return jjStopAtPos(0, 9);
			case 123 :
				return jjStopAtPos(0, 12);
			case 125 :
				return jjStopAtPos(0, 13);
			default :
				return jjMoveNfa_0(5, 0);
		}
	}
	private final void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}
	private final void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}
	private final void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}
	private final void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}
	private final void jjCheckNAddStates(int start) {
		jjCheckNAdd(jjnextStates[start]);
		jjCheckNAdd(jjnextStates[start + 1]);
	}
	static final long[] jjbitVec0 = {0x0L, 0x0L, 0xffffffffffffffffL,
			0xffffffffffffffffL};
	private final int jjMoveNfa_0(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 16;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 5 :
							if ((0xd7ffecfaffffd9ffL & l) != 0L) {
								if (kind > 16)
									kind = 16;
								jjCheckNAdd(11);
							}
							if ((0x3ff000000000000L & l) != 0L) {
								if (kind > 7)
									kind = 7;
								jjCheckNAddStates(0, 2);
							} else if (curChar == 45)
								jjCheckNAddStates(0, 2);
							else if (curChar == 46)
								jjCheckNAdd(7);
							else if (curChar == 47)
								jjstateSet[jjnewStateCnt++] = 0;
							break;
						case 0 :
							if (curChar == 47)
								jjCheckNAddStates(3, 5);
							break;
						case 1 :
							if ((0xffffffffffffdbffL & l) != 0L)
								jjCheckNAddStates(3, 5);
							break;
						case 2 :
							if ((0x2400L & l) != 0L && kind > 6)
								kind = 6;
							break;
						case 3 :
							if (curChar == 10 && kind > 6)
								kind = 6;
							break;
						case 4 :
							if (curChar == 13)
								jjstateSet[jjnewStateCnt++] = 3;
							break;
						case 6 :
							if (curChar == 46)
								jjCheckNAdd(7);
							break;
						case 7 :
							if ((0x3ff000000000000L & l) == 0L)
								break;
							if (kind > 8)
								kind = 8;
							jjCheckNAddTwoStates(7, 8);
							break;
						case 9 :
							if ((0x280000000000L & l) != 0L)
								jjCheckNAdd(10);
							break;
						case 10 :
							if ((0x3ff000000000000L & l) == 0L)
								break;
							if (kind > 8)
								kind = 8;
							jjCheckNAdd(10);
							break;
						case 11 :
							if ((0xd7ffecfaffffd9ffL & l) == 0L)
								break;
							if (kind > 16)
								kind = 16;
							jjCheckNAdd(11);
							break;
						case 12 :
							if (curChar == 45)
								jjCheckNAddStates(0, 2);
							break;
						case 13 :
							if ((0x3ff000000000000L & l) == 0L)
								break;
							if (kind > 7)
								kind = 7;
							jjCheckNAdd(13);
							break;
						case 14 :
							if ((0x3ff000000000000L & l) != 0L)
								jjCheckNAddTwoStates(14, 6);
							break;
						case 15 :
							if ((0x3ff000000000000L & l) == 0L)
								break;
							if (kind > 7)
								kind = 7;
							jjCheckNAddStates(0, 2);
							break;
						default :
							break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 5 :
						case 11 :
							if ((0xd7ffffffffffffffL & l) == 0L)
								break;
							if (kind > 16)
								kind = 16;
							jjCheckNAdd(11);
							break;
						case 1 :
							jjAddStates(3, 5);
							break;
						case 8 :
							if ((0x2000000020L & l) != 0L)
								jjAddStates(6, 7);
							break;
						default :
							break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 5 :
						case 11 :
							if ((jjbitVec0[i2] & l2) == 0L)
								break;
							if (kind > 16)
								kind = 16;
							jjCheckNAdd(11);
							break;
						case 1 :
							if ((jjbitVec0[i2] & l2) != 0L)
								jjAddStates(3, 5);
							break;
						default :
							break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 16 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}
	private final int jjStopStringLiteralDfa_1(int pos, long active0) {
		switch (pos) {
			case 0 :
				if ((active0 & 0x7f80000L) != 0L)
					return 2;
				return -1;
			default :
				return -1;
		}
	}
	private final int jjStartNfa_1(int pos, long active0) {
		return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0), pos + 1);
	}
	private final int jjStartNfaWithStates_1(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_1(state, pos + 1);
	}
	private final int jjMoveStringLiteralDfa0_1() {
		switch (curChar) {
			case 34 :
				return jjStopAtPos(0, 29);
			case 92 :
				return jjMoveStringLiteralDfa1_1(0x7f80000L);
			default :
				return jjMoveNfa_1(1, 0);
		}
	}
	private final int jjMoveStringLiteralDfa1_1(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_1(0, active0);
			return 1;
		}
		switch (curChar) {
			case 34 :
				if ((active0 & 0x4000000L) != 0L)
					return jjStopAtPos(1, 26);
				break;
			case 92 :
				if ((active0 & 0x80000L) != 0L)
					return jjStopAtPos(1, 19);
				break;
			case 97 :
				if ((active0 & 0x100000L) != 0L)
					return jjStopAtPos(1, 20);
				break;
			case 98 :
				if ((active0 & 0x200000L) != 0L)
					return jjStopAtPos(1, 21);
				break;
			case 102 :
				if ((active0 & 0x2000000L) != 0L)
					return jjStopAtPos(1, 25);
				break;
			case 110 :
				if ((active0 & 0x800000L) != 0L)
					return jjStopAtPos(1, 23);
				break;
			case 116 :
				if ((active0 & 0x400000L) != 0L)
					return jjStopAtPos(1, 22);
				break;
			case 118 :
				if ((active0 & 0x1000000L) != 0L)
					return jjStopAtPos(1, 24);
				break;
			default :
				break;
		}
		return jjStartNfa_1(0, active0);
	}
	private final int jjMoveNfa_1(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 11;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 1 :
						case 0 :
							if ((0xfffffffbffffffffL & l) == 0L)
								break;
							if (kind > 18)
								kind = 18;
							jjCheckNAdd(0);
							break;
						case 2 :
							if ((0xff000000000000L & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 3;
							break;
						case 3 :
							if ((0xff000000000000L & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 4;
							break;
						case 4 :
							if ((0xff000000000000L & l) != 0L && kind > 27)
								kind = 27;
							break;
						case 6 :
							if ((0x3ff000000000000L & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 7;
							break;
						case 7 :
							if ((0x3ff000000000000L & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 8;
							break;
						case 8 :
							if ((0x3ff000000000000L & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 9;
							break;
						case 9 :
							if ((0x3ff000000000000L & l) != 0L && kind > 28)
								kind = 28;
							break;
						default :
							break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 1 :
							if ((0xffffffffefffffffL & l) != 0L) {
								if (kind > 18)
									kind = 18;
								jjCheckNAdd(0);
							} else if (curChar == 92)
								jjstateSet[jjnewStateCnt++] = 5;
							if (curChar == 92)
								jjstateSet[jjnewStateCnt++] = 2;
							break;
						case 2 :
							if (curChar == 85)
								jjstateSet[jjnewStateCnt++] = 6;
							break;
						case 0 :
							if ((0xffffffffefffffffL & l) == 0L)
								break;
							if (kind > 18)
								kind = 18;
							jjCheckNAdd(0);
							break;
						case 6 :
							if ((0x7e0000007eL & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 7;
							break;
						case 7 :
							if ((0x7e0000007eL & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 8;
							break;
						case 8 :
							if ((0x7e0000007eL & l) != 0L)
								jjstateSet[jjnewStateCnt++] = 9;
							break;
						case 9 :
							if ((0x7e0000007eL & l) != 0L && kind > 28)
								kind = 28;
							break;
						case 10 :
							if (curChar == 92)
								jjstateSet[jjnewStateCnt++] = 5;
							break;
						default :
							break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				MatchLoop : do {
					switch (jjstateSet[--i]) {
						case 1 :
						case 0 :
							if ((jjbitVec0[i2] & l2) == 0L)
								break;
							if (kind > 18)
								kind = 18;
							jjCheckNAdd(0);
							break;
						default :
							break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 11 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}
	static final int[] jjnextStates = {13, 14, 6, 1, 2, 4, 9, 10,};
	public static final String[] jjstrLiteralImages = {"", null, null, null,
			null, null, null, null, null, "\75", "\50", "\51", "\173", "\175",
			"\54", "\73", null, null, null, null, null, null, null, null, null,
			null, null, null, null, null,};
	public static final String[] lexStateNames = {"DEFAULT",
			"WithinQuotedString",};
	public static final int[] jjnewLexState = {-1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, 0,};
	static final long[] jjtoToken = {0x2001ff81L,};
	static final long[] jjtoSkip = {0x2007eL,};
	static final long[] jjtoMore = {0x1ffc0000L,};
	protected SimpleCharStream input_stream;
	private final int[] jjrounds = new int[16];
	private final int[] jjstateSet = new int[32];
	StringBuffer image;
	int jjimageLen;
	int lengthOfMatch;
	protected char curChar;
	public ParserTokenManager(SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag)
			throw new Error(
					"ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		input_stream = stream;
	}
	public ParserTokenManager(SimpleCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}
	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}
	private final void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 16; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}
	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}
	public void SwitchTo(int lexState) {
		if (lexState >= 2 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : "
					+ lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}
	protected Token jjFillToken() {
		Token t = Token.newToken(jjmatchedKind);
		t.kind = jjmatchedKind;
		String im = jjstrLiteralImages[jjmatchedKind];
		t.image = (im == null) ? input_stream.GetImage() : im;
		t.beginLine = input_stream.getBeginLine();
		t.beginColumn = input_stream.getBeginColumn();
		t.endLine = input_stream.getEndLine();
		t.endColumn = input_stream.getEndColumn();
		return t;
	}
	int curLexState = 0;
	int defaultLexState = 0;
	int jjnewStateCnt;
	int jjround;
	int jjmatchedPos;
	int jjmatchedKind;
	public Token getNextToken() {
		Token matchedToken;
		int curPos = 0;
		EOFLoop : for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				return matchedToken;
			}
			image = null;
			jjimageLen = 0;
			for (;;) {
				switch (curLexState) {
					case 0 :
						try {
							input_stream.backup(0);
							while (curChar <= 32
									&& (0x100002600L & (1L << curChar)) != 0L)
								curChar = input_stream.BeginToken();
						} catch (java.io.IOException e1) {
							continue EOFLoop;
						}
						jjmatchedKind = 0x7fffffff;
						jjmatchedPos = 0;
						curPos = jjMoveStringLiteralDfa0_0();
						break;
					case 1 :
						jjmatchedKind = 0x7fffffff;
						jjmatchedPos = 0;
						curPos = jjMoveStringLiteralDfa0_1();
						break;
				}
				if (jjmatchedKind != 0x7fffffff) {
					if (jjmatchedPos + 1 < curPos)
						input_stream.backup(curPos - jjmatchedPos - 1);
					if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						matchedToken = jjFillToken();
						TokenLexicalActions(matchedToken);
						if (jjnewLexState[jjmatchedKind] != -1)
							curLexState = jjnewLexState[jjmatchedKind];
						return matchedToken;
					} else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
						if (jjnewLexState[jjmatchedKind] != -1)
							curLexState = jjnewLexState[jjmatchedKind];
						continue EOFLoop;
					}
					MoreLexicalActions();
					if (jjnewLexState[jjmatchedKind] != -1)
						curLexState = jjnewLexState[jjmatchedKind];
					curPos = 0;
					jjmatchedKind = 0x7fffffff;
					try {
						curChar = input_stream.readChar();
						continue;
					} catch (java.io.IOException e1) {
					}
				}
				int error_line = input_stream.getEndLine();
				int error_column = input_stream.getEndColumn();
				String error_after = null;
				boolean EOFSeen = false;
				try {
					input_stream.readChar();
					input_stream.backup(1);
				} catch (java.io.IOException e1) {
					EOFSeen = true;
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
					if (curChar == '\n' || curChar == '\r') {
						error_line++;
						error_column = 0;
					} else
						error_column++;
				}
				if (!EOFSeen) {
					input_stream.backup(1);
					error_after = curPos <= 1 ? "" : input_stream.GetImage();
				}
				throw new TokenMgrError(EOFSeen, curLexState, error_line,
						error_column, error_after, curChar,
						TokenMgrError.LEXICAL_ERROR);
			}
		}
	}
	void MoreLexicalActions() {
		jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
		switch (jjmatchedKind) {
			case 19 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				image.setLength(image.length() - 1);
				break;
			case 20 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				int len = image.length();
				image.setCharAt(len - 2, (char) 7);
				image.setLength(len - 1);
				break;
			case 21 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, '\b');
				image.setLength(len - 1);
				break;
			case 22 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, '\t');
				image.setLength(len - 1);
				break;
			case 23 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, '\n');
				image.setLength(len - 1);
				break;
			case 24 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, (char) 11);
				image.setLength(len - 1);
				break;
			case 25 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, '\f');
				image.setLength(len - 1);
				break;
			case 26 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				len = image.length();
				image.setCharAt(len - 2, '"');
				image.setLength(len - 1);
				break;
			case 27 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				int oct;
				len = image.length();
				oct = (image.charAt(len - 1) - '0') + 8
						* (image.charAt(len - 2) - '0') + 64
						* (image.charAt(len - 3) - '0');
				image.setCharAt(len - 4, (char) oct);
				image.setLength(len - 3);
				break;
			case 28 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen)));
				else
					image
							.append(new String(input_stream
									.GetSuffix(jjimageLen)));
				jjimageLen = 0;
				int c, 
				base = 1, 
				hex = 0;
				len = image.length();
				for (int i = 0; i < 4; ++i) {
					c = image.charAt(len - (i + 1));
					if (c <= '9')
						c -= '0';
					else if (c <= 'F')
						c = (c - 'A') + 10;
					else
						c = (c - 'a') + 10;
					hex += c * base;
					base *= 16;
				}
				image.setCharAt(len - 6, (char) hex);
				image.setLength(len - 5);
				break;
			default :
				break;
		}
	}
	void TokenLexicalActions(Token matchedToken) {
		switch (jjmatchedKind) {
			case 29 :
				if (image == null)
					image = new StringBuffer(new String(input_stream
							.GetSuffix(jjimageLen
									+ (lengthOfMatch = jjmatchedPos + 1))));
				else
					image.append(new String(input_stream.GetSuffix(jjimageLen
							+ (lengthOfMatch = jjmatchedPos + 1))));
				image.setLength(image.length() - 1);
				matchedToken.image = image.toString();
				break;
			default :
				break;
		}
	}
}
