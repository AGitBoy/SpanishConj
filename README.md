# Conjugate Tool

A little tool that I made for fun. It conjugates ar, er, and ir verbs, as well as some irregulars, and then outputs them accordingly.
This is not intended for serious usage in natural language processing. It was intended as a little fun project for practicing
my skills as a programmer, specifically in the area of string manipulation. It also was intended to help me practice my
conjugation skills and memorization, as I am an English speaker learning Spanish.

## Usage

Download and build, run:
```
java -jar PATH/TO/JAR/Conjugate.jar INPUT
```
Note that INPUT should be in the format of a pronoun and then an unconjugated verb, for example
```
java -jar PATH/TO/JAR/Conjugate.jar nosotros escribir
```
or,
```
java -jar PATH/TO/JAR/Conjugate.jar tú bailar
```

For interactive mode do
```
java -jar PATH/TO/JAR/Conjugate.jar -i
```
