package constructores;


//publicamos la clase arbol con variables tamaño y nombre
public class tree {
    private int height;
    private String name;

	//Definimos 4 tipos de arboles 
	//1º- No tiene ninguna variable asignada, para el tamaño ponemos 0 y para el nombre null, así decimos que estan vacios
    public tree() {
        this(0, null);
    }
	
	//2º- Tiene la variable tamaño solamente
    public tree(int height) {
        this(height, null);
    }
	//3º- Tiene la variable nombre
    public tree(String name) {
        this(0, name);
    }
	//4º- Tiene las variables nombre y tamaño
    public tree(int height, String name) {
        this.height = height;
        this.name = name;
    }
	
	//funcion tostring para escribir las frases segun lo que tengamos...
@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
		
		//para empezar escribimos un, que es comun en todas las frases
        sb.append("Un ");
		
		//Si tenemos el nombre del arbol lo ponemos, pero si no (null) ponemos la palabra arbol
        if (name == null)
            sb.append("árbol");
        else
            sb.append(name);
			
		//Si el tamaño es mayor que 0, escribimos de + tamaño + metros...
        if (height > 0)
            sb.append(" de ").append(height).append(" metros");
        return sb.toString();
    }
    } 
}