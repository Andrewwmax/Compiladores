package semantico;

import parser.Token;

public abstract class Item {

    Token token;

    public Item(Token token) {
        this.token = token;
    }

    public Token getToken() {
		return token;
	}

	public String getLexema() {
        return null;
    }

    @Override
    public abstract String toString();
}
