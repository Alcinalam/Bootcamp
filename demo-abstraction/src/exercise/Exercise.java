package exercise;

public interface Exercise extends Run, Walk {
  // Class cannot extend multiple Parent Class
  // but interface can extend multiple interfacess

  void swim();
}
