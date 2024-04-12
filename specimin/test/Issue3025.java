import org.checkerframework.checker.nullness.qual.Nullable;

class Caller {
  <T> void foo(Sub<? super T> arg) {
    bar(arg);
    hashCode();
  }

  void bar(Sub<?> arg) {}
}

interface Super<T> {}

interface Sub<T> extends Super<@Nullable T> {}