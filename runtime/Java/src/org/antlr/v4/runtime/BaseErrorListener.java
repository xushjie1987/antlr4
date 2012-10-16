/*
 [The "BSD license"]
 Copyright (c) 2012 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.antlr.v4.runtime;

import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.SimulatorState;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

/**
 * @author Sam Harwell
 */
public class BaseErrorListener<Symbol extends Token> implements ParserErrorListener<Symbol> {
	@Override
	public <T extends Symbol> void syntaxError(Recognizer<T, ?> recognizer,
											   T offendingSymbol,
											   int line,
											   int charPositionInLine,
											   String msg,
											   RecognitionException e)
	{
	}

	@Override
	public void reportAmbiguity(Parser<? extends Symbol> recognizer,
								DFA dfa,
								int startIndex,
								int stopIndex,
								BitSet ambigAlts,
								ATNConfigSet configs)
	{
	}

	@Override
	public <T extends Symbol> void reportAttemptingFullContext(Parser<T> recognizer,
															   DFA dfa,
															   int startIndex,
															   int stopIndex,
															   SimulatorState<T> initialState)
	{
	}

	@Override
	public <T extends Symbol> void reportContextSensitivity(Parser<T> recognizer,
															DFA dfa,
															int startIndex,
															int stopIndex,
															SimulatorState<T> acceptState)
	{
	}
}
