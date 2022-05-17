package src.main.java.taco.jpa;
import lombok.java;
import lombok.RequiredArgsContructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

public class Ingredient {
	private final String id;
	private final String name;
	private final String type;
	public static enum Type()
	{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@Entity
public class Ingredient {
@Id
private final String id;
private final String name;
@Enumerated(EnumType.STRING)
private final Type type;
public static enum Type {
WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
}
}