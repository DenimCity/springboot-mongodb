import React, { Component } from 'react';
import axios from 'axios'
import HotelInfo from './HotelInfo'

class Landing extends Component {
    state = {
        hotels:[]
    }

    getHotels = ()=> {
        
        const baseAPI = 'http://localhost:8080'
       
        axios.get(baseAPI).then(response => {
            const hotels = response.data
           
            this.setState({hotels})
        })
    }



    componentWillMount() {
        this.getHotels()
    }

    render() {

    
        return (
            <div>
               welcome from the landing age
               <HotelInfo hotelinfo={this.state.hotels}/>
            </div>
        );
    }
}

export default Landing;