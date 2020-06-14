package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Store {
   
   private int floor;
   
   @NotEmpty(message="한 글자 이상 입력해 주세요.")
   private String name;
   
   private int row;
   
   private int col;
   
   public void setFloor(int floor) {
      this.floor=floor;
   }
   public void setName(String name) {
      this.name=name;
   }
   public void setRow(int row) {
      this.row=row;
   }
   public void setCol(int col) {
      this.col=col;
   }
   public int getFloor() {
      return floor;
   }
   public String getName() {
      return name;
   }
   public int getRow() {
      return row;
   }
   public int getCol() {
      return col;
   }
}