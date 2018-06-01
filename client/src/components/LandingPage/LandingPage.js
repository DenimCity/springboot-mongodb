import React, { Component } from "react";
import axios from "axios";
import HotelInfo from "./../HotelInfo";
import * as apiService from '../../utilities/axiosServices'

import './LandingPage.scss'

class Landing extends Component {
  state = {
    hotels: []
  };



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
        <h1 className='header'> welcome from the landing age </h1>
        <HotelInfo hotel_info={this.state.hotels} />
      </div>
    );
  }
}

export default Landing;
