import React, { Component } from "react";
import axios from "axios";
import HotelInfo from "./HotelInfo";
// import * as apiService from '../services/axiosServices'

class Landing extends Component {
  state = {
    hotels: []
  };

  // componentWillMount() {

  //     return Promise.all([
  //         axios.get('http://localhost:8080').then(response => {
  //             const hotels = response.data
  //             this.setState({hotels})
  //         })

  //     ])
  //       apiService.allHotels.then(response => {
  //         console.log('respone', response)
  //         const hotels = response.data

  //         this.setState({hotels})
  //     })

  // }

  getHotels = () => {
    const baseAPI = "http://localhost:8080";

    axios.get(baseAPI).then(response => {
      const hotels = response.data;
      this.setState({ hotels });
    });
  };

  componentWillMount() {
    this.getHotels();
  }

  render() {
    return (
      <div>
        welcome from the landing age
        <HotelInfo hotelinfo={this.state.hotels} />
      </div>
    );
  }
}

export default Landing;
