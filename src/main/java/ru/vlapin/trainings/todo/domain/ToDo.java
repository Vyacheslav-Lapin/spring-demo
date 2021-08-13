package ru.vlapin.trainings.todo.domain;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Getter
@Builder
@ToString
@Setter(PRIVATE)
@RequiredArgsConstructor
@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PROTECTED)
public class ToDo {

  //region id and version
  @Id
  @Include
  @GeneratedValue
  @Column(updatable = false, nullable = false)
  UUID id;

  @Version
  int version;
  //endregion

  @NonNull
  @Column(nullable = false)
  String description;

  @NonNull
  @Column(nullable = false)
  LocalDateTime created;

  @NonNull
  @Column(nullable = false)
  LocalDateTime modified;

  @NonNull
  @Column(nullable = false)
  Boolean completed;

  //region equals and hashCode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    ToDo toDo = (ToDo) o;

    return Objects.equals(id, toDo.id);
  }

  @Override
  public int hashCode() {
    return 657408436;
  }
  //endregion
}
