// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.team88.ros;

import java.util.Objects;

public class Pair<A, B> {
  private final A m_first;
  private final B m_second;
  private final int m_hashCode;

  public Pair(A first, B second) {
    m_first = first;
    m_second = second;
    m_hashCode = Objects.hash(m_first, m_second);
  }

  public A getFirst() {
    return m_first;
  }

  public B getSecond() {
    return m_second;
  }

  public static <A, B> Pair<A, B> of(A a, B b) {
    return new Pair<>(a, b);
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    Pair<?, ?> other_pair = (Pair<?, ?>) other;
    return this.m_first.equals(other_pair.m_first) && this.m_second.equals(other_pair.m_second);
  }

  @Override
  public int hashCode() {
    return this.m_hashCode;
  }
}
