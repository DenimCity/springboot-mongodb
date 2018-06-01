import React, {Component} from 'react';

export default class HotelInfo extends Component  {
    
   render(){
    console.log('props', this.props)
    return (
        <div>
            <div>
        
                {this.props.hotel_info.map((hotel,i) => (
                 <h5 key={i}>{hotel.name} {hotel.address.city}</h5>)
                
                )}
            </div>
        </div>
    );
}
}




