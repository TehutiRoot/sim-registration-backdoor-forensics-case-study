package org.apache.http.impl.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: classes6.dex */
public class NTLMScheme extends AuthSchemeBase {

    /* renamed from: a */
    public final NTLMEngine f73984a;

    /* renamed from: b */
    public State f73985b;

    /* renamed from: c */
    public String f73986c;

    /* loaded from: classes6.dex */
    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public NTLMScheme(NTLMEngine nTLMEngine) {
        Args.notNull(nTLMEngine, "NTLM engine");
        this.f73984a = nTLMEngine;
        this.f73985b = State.UNINITIATED;
        this.f73986c = null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        String generateType3Msg;
        try {
            NTCredentials nTCredentials = (NTCredentials) credentials;
            State state = this.f73985b;
            if (state != State.FAILED) {
                if (state == State.CHALLENGE_RECEIVED) {
                    generateType3Msg = this.f73984a.generateType1Msg(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                    this.f73985b = State.MSG_TYPE1_GENERATED;
                } else if (state == State.MSG_TYPE2_RECEVIED) {
                    generateType3Msg = this.f73984a.generateType3Msg(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.f73986c);
                    this.f73985b = State.MSG_TYPE3_GENERATED;
                } else {
                    throw new AuthenticationException("Unexpected state: " + this.f73985b);
                }
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
                if (isProxy()) {
                    charArrayBuffer.append("Proxy-Authorization");
                } else {
                    charArrayBuffer.append("Authorization");
                }
                charArrayBuffer.append(": NTLM ");
                charArrayBuffer.append(generateType3Msg);
                return new BufferedHeader(charArrayBuffer);
            }
            throw new AuthenticationException("NTLM authentication failed");
        } catch (ClassCastException unused) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + credentials.getClass().getName());
        }
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "ntlm";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        State state = this.f73985b;
        if (state != State.MSG_TYPE3_GENERATED && state != State.FAILED) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        String substringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        this.f73986c = substringTrimmed;
        if (substringTrimmed.isEmpty()) {
            if (this.f73985b == State.UNINITIATED) {
                this.f73985b = State.CHALLENGE_RECEIVED;
                return;
            } else {
                this.f73985b = State.FAILED;
                return;
            }
        }
        State state = this.f73985b;
        State state2 = State.MSG_TYPE1_GENERATED;
        if (state.compareTo(state2) >= 0) {
            if (this.f73985b == state2) {
                this.f73985b = State.MSG_TYPE2_RECEVIED;
                return;
            }
            return;
        }
        this.f73985b = State.FAILED;
        throw new MalformedChallengeException("Out of sequence NTLM response message");
    }

    public NTLMScheme() {
        this(new NTLMEngineImpl());
    }
}
