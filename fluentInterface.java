interface IEdibleItem{
   public void Prepare()
}
class VanilaBaseCream implements IEdibleItem{ 
     public void Prepare(){}
}

abstract class EdibleItemDecorator implements IEdibleItem{
    IEdibleItem _targetObj;
    public EdibleItemDecorator(IEdibleItem target){
        this._targetObj=target;
    }
    public vod Prepare(){
        
        this._targetObj.Prepare();
    }
    
    
}
class Honey extends EdibleItemDecorator {
      public vod Prepare(){
          //Logic
     	   base / super.Prepare();
     }

}
class Nuts extends EdibleItemDecorator{
     public vod Prepare(){
          //Logic
     	   base / super.Prepare();
     }

}
class Sprinkles extends EdibleItemDecorator{
     public vod Prepare(){
          //Logic
     	   base / super.Prepare();
     }
}
class Cereal extends EdibleItemDecorator{
     public vod Prepare(){
          //Logic
     	   base / super.Prepare();
     }
}

class IceCreamParlor {
    
    SelectVanilaIceCream(){}
    
    AddHoney(){
        
    }
    AddCereal(){
        
    }
    
    AddNuts(){
        
    }
    IEdibleItem GetFlavouredIceCream(){
        
    } 
    
}

main(){

    IceCreamParlor _parlor=new IceCreamParlor();         
    IEdibleItem iceCream= _parlor.SelectVanilaIceCream().AddHoney().AddNuts().GetFlavouredIceCream();
iceCream.Prepare();
    iceCream= _parlor.SelectVanilaIceCream().AddNuts().AddCereal().GetFlavouredIceCream();
    iceCream.Prepare();
}
