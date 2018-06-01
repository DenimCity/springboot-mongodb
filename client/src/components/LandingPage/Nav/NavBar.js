import React from 'react'
import styled from 'styled-components'

const NavBar = () => {
  return (
    <Nav>
      <div>
        <h1>Hotel Tesla</h1>
      </div>
     
      
    </Nav>
  );
};

export default NavBar;

const Nav = styled.div `
background-image: url('http://st.automobilemag.com/uploads/sites/11/2017/12/Novitec-Tesla-Model-S20.jpg');
background-repeat: no-repeat;
background-attachment: fixed;
background-position: center; 
border-bottom: 1px solid #EAEAEB;
text-align:center;
width:100%;
min-height:200px;
display:flex;
justify-content:center;
align-items:center; 
flex-direction:column;
a{ 
  
  clear:right;
  text-decoration: none;
  color:gray;
  margin: 0 10px;
  line-height: 70px;
  font-size:2rem;
  font-family:'Passion One', cursive;
  &:hover{
    color:white;
  }
  }
  span{
    color:red;
    &:hover{
      color:goldenrod;
    }
  }
`