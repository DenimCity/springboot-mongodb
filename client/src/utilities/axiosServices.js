import axios from "axios";

const baseUrl = "http://localhost:8080";

export let allHotels = () => {
  return axios.get(baseUrl);
};

export let createUser = requestBody => {
  return axios.get(baseUrl, requestBody);
};

export let postUser = async userId => {
  await axios.post(baseUrl + "/" + userId);
};

export let xyz = newHotelinfo => {
  return axios.put(baseUrl + "/", newHotelinfo);
};

export let byID = hotelId => {
  // multiple ways to write it
  return axios.get(baseUrl + "/" + hotelId);
  // return axios.get`${baseUrl}/${hotelId}`
};

export let createHotel = hotelinfo => {
  return axios.post(baseUrl + "/new", hotelinfo);
};

export let deleteHote = hotelId => {
  return axios.delete(baseUrl + "/" + hotelId);
};
