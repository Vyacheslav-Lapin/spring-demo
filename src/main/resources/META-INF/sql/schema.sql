create table todo
(
  id          varchar(36)  not null,
  version     integer      not null default 0,
  description varchar(255) not null,
  created     timestamp,
  modified    timestamp,
  completed   boolean,
  primary key (id)
);
