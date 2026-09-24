# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

P is our initial loan amount. It is the principal. Y is the number of years. R represents the yearly inttrest rate. 

**2. What does the method return?**

The methon return is the amount of interest earned overtime. 

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` |CompundInterest |
| `p` |principal |
| `y` |loanTerm |
| `r` |interestRate |
| `t` |balance |

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java

//formula for remaining balance of loan

public static double CompundInterest(double principal, int loanTerm, double interestRate) {
    double t = principal;

//for every run do this
    for (int i = 0; i < loanTerm; i++) {
        balance = balance  + (balance  * interestRate);
    }
    return t - principal;

    //remember the closing bracket
}
```

## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**

I think the b

>
