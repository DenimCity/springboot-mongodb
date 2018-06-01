import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import LandingPage from './components/LandingPage/LandingPage.js'
import './App.css';

import NavBar from './Nav/NavBar'

class App extends Component {
  render() {
    return (
        <div>
            <NavBar/>
            <Router>
                <Switch>
                    <Route exact path="/" component={LandingPage}/>
                    {/* <Route exact path="/about" component={AboutPage}/>
                    <Route exact path="/cities" component={CitiesList}/>
                    <Route exact path="/cities/:cityId/houses" component={HouseList}/>
                    <Route exact path="/meetups" component={MeetUpApiCall}/>
                    <Route exact path="/hosting" component={HouseForm}/>
                    <Route exact path="/signin" component={SignIn}/>
                    <Route exact path="/housepending" component={HomePending}/> */}
                </Switch>
            </Router>
        </div>
    );
  }
}

export default App;
