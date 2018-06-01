import axios from "axios";

const baseUrl = "http://localhost:8080";

export let all_Hotels = () => {
  return axios.get(baseUrl);
};

export let create_User = requestBody => {
  return axios.get(baseUrl, requestBody);
  
};

export let post_User = async userId => {
  await axios.post(baseUrl + "/" + userId);
};

export let xyz = (hotel_info) => {
  return axios.put(baseUrl + "/", hotel_info)
};

export let grab_Hotel_Id = hotel_Id => {
  // multiple ways to write it
  return axios.get(baseUrl + "/" + hotel_Id);
  // return axios.get`${baseUrl}/${hotelId}`
};

 

export let create_Hotel = hotel_info => {
  return axios.post(baseUrl + "/new", hotel_info);
};

export let delete_Hotel = hotel_Id => {
  return axios.delete(baseUrl + "/" + hotel_Id);
};


