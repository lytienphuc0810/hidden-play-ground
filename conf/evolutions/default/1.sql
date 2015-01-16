# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                        varchar(255) not null,
  name                      varchar(255),
  parent_category_id        varchar(255),
  constraint pk_category primary key (id))
;

create table item (
  id                        varchar(255) not null,
  name                      varchar(255),
  price                     varchar(255),
  featured                  tinyint(1) default 0,
  recommended               tinyint(1) default 0,
  image_path                varchar(255),
  category_id               varchar(255),
  ins_date                  varchar(255),
  upd_date                  varchar(255),
  constraint pk_item primary key (id))
;

alter table category add constraint fk_category_parentCategory_1 foreign key (parent_category_id) references category (id) on delete restrict on update restrict;
create index ix_category_parentCategory_1 on category (parent_category_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table category;

drop table item;

SET FOREIGN_KEY_CHECKS=1;

