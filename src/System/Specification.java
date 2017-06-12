package System;

public interface Specification<T> {
	
	public boolean IsSatisfiedBy(T entity);
}
