/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartecyclepro;

/**
 *
 * @author aditi jadhao
 */
public final class BrandSession {
    private static BrandSession instance;
    private String brandName;

    private BrandSession(String brandName) {
        this.brandName = brandName;
    }

    public static BrandSession getInstance(String brandName) {
          if(instance == null) {
            instance = new BrandSession(brandName);
        }
        return instance;
    }

    public String getBrandName() {
        return brandName;
    }
      public void cleanUserSession() {
        brandName = "";
    }

    
    
}
