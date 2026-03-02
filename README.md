# OOPS_BANNER_APP

This repository contains a simple Java application that demonstrates
printing the literal text **"OOPS"** to the console as part of the
initial use case (UC1) of a banner application. The project will be
expanded later to display banner patterns and employ object-oriented
techniques.

## UC1: Print OOPS to Console

**Goal:** Display the literal text `"OOPS"` (Object-Oriented Programming
System) once on the console.

### Requirements

- Java class named `OOPSBannerApp`.
- Implement a `main` method with signature:
  `public static void main(String[] args)`.
- Use `System.out.println("OOPS")` for output.
- Include JavaDoc comments for the class.

### Compile & Run

```powershell
javac OOPSBannerApp.java
java OOPSBannerApp
```

Initially the program prints the literal text `OOPS` (UC1). For UC2 the
same class has been extended so that the output becomes a multi-line
banner:

```
*********   *********   *********   *********
*       *   *       *   *       *   *        
*       *   *       *   *       *   *
*       *   *       *   *********   *********
*       *   *       *   *                   *
*       *   *       *   *                   *
*********   *********   *           *********
```

The banner is created with a series of `System.out.println()` calls and
string concatenation; each character pattern spans 7 lines and is 9
characters wide.

### Git Workflow

1. Create a feature branch:
   ```bash
git checkout -b feature/UC1:PrintOOPS
```
2. Add and commit your changes:
   ```bash
git add .
git commit -m "Coded UC1 to Print OOPS to Console"
```
3. Push feature branch:
   ```bash
git push origin feature/UC1:PrintOOPS
```
4. Merge into `dev`:
   ```bash
git checkout dev
git pull origin dev
git merge feature/UC1:PrintOOPS
git push origin dev
```

> ⚠️ The above steps are for reference; actual remote repository URLs may
> vary.
