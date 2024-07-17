Aspect Oriented Programming { AOP }

It is a programming approach that helps separate different parts of a program to make it easier to manage and understand.

In many application, there are common tasks like logging, security checks, or transaction management that are needed in multiple places. These tasks are called cross-cutting concerns because they "cut across" many parts of the application.


What : Aspect
	What code or logic we want spring to execute when we call a	specific method. This is called as Aspect.
When : Advice
	When spring need to execute the given Aspect. For an example is 	it before or after the method call. This is called Advice.
Which : Pointcut
	Which method inside App that framework need to intercept 	and execute the given Aspect. This is called as a Pointcut.
