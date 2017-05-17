package demo.user;

import demo.data.BaseEntity;

import javax.persistence.*;
import java.security.Principal;

@Entity
public class User extends BaseEntity implements Principal {

 private Long id;

 private String username;

 private String firstName;

 private String lastName;

 private String email;

 public User() {
 }

 public User(String username, String firstName, String lastName, String email) {
  this.username = username;
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
 }

 public User(String firstName, String lastName, String email) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.email = email;
 }

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 @Transient
 @Override
 public String getName() {
  return username;
 }

 @Override
 public String toString() {
  return "User{" + "id=" + id + ", username='" + username + '\''
   + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
   + ", email='" + email + '\'' + "} " + super.toString();
 }
}
