package com.debuggeando_ideas.util_function.examples.function;

import com.debuggeando_ideas.util_function.Person;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionApp {

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n + 10;
    static Function<Integer, Integer> andThenMultiply = multiply.andThen(sum);
    static Function<Integer, Integer> composeMultiply = multiply.compose(sum);

    static Function<Person, ByteArrayOutputStream> serializer = p -> {
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

        try (ObjectOutput outputStream = new ObjectOutputStream(inMemoryBytes))  {
            outputStream.writeObject(p);
            outputStream.flush();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return inMemoryBytes;
    };

    static Function<ByteArrayInputStream, Person> deserializer = bytes -> {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(bytes)) {
            return (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    };

    public static void main(String[] args) {
        // Function interface is intended for operations with object
        System.out.println("\n\t\t\t ---- andThen & compose ----");
        System.out.println("This is a simple multiply by 10: " + multiply.apply(5));
        System.out.println("This is a simple sum by 10: " + sum.apply(5));
        System.out.println("This is andThen operation behaviour (x * 10) + 10: " + andThenMultiply.apply(5));
        System.out.println("This is compose operation behaviour (x + 10) * 10: " + composeMultiply.apply(5));

        System.out.println("\n\t\t\t ---- serialize & deserialize ----");
        ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Max", 26));
        System.out.println("Serializing Person object: " + Arrays.toString(objectSerialized.toByteArray()));
        Person objectDeserialized = deserializer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));
        System.out.println("Deserializing the previous Person object: " + objectDeserialized);
    }
}
