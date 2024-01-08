package go.ihm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import go.Color;
import go.Goban;
import go.IPlayer;

public class Main {
	private static Map<Color, IPlayer> playersMap = new HashMap<>();
	private static Goban goban;

	public static void main(String[] args) throws IOException {
		if (args.length <= 1 && args[0].toLowerCase().equals("gtp")) {
			new GTPInterpreter().session();
		} else if (args[0].toLowerCase().equals("direct") && args.length == 3) {
			modeDirect(args[1], args[2]);
		} else {
			System.out.println("Arguments de la ligne de commandes incorrects : " + args);
		}
	}

	public static void modeDirect(String playerBlack, String playerWhite) {
		
	}
}
