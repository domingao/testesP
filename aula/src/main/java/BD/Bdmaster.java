package BD;

import java.util.ArrayList;

import entidades.Usuario;

public class Bdmaster {
	static ArrayList<Usuario> usuarios = new ArrayList<>();

	public static boolean BuscarBd(Usuario user) {

		usuarios.add(user);
		for (int a = 0; a <= usuarios.size(); a++) {
			if (usuarios.get(a).getEmail() == "luancesar@hotmail.com") {
				return true;
			}
		}
		return false;
	}

	public static boolean BuscarBd2(Usuario user) {
		usuarios.add(user);
		for (int a = 0; a <= usuarios.size(); a++) {
			if (usuarios.get(a).getSenha() == "123") {
				return true;
			}
		}
		return false;
	}

}
