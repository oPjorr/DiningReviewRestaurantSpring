import axios from "axios";

const BASE_URL = `${import.meta.env.VITE_API_URL}`;

const apiClient = axios.create({
  baseURL: BASE_URL,
  headers: {
    Accept: "application/json",
    "Content-Type": "application/json",
  },
});

export default apiClient
